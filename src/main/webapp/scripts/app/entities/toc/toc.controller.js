'use strict';

angular.module('cumuluslabrepoApp')
    .controller('TocController', function ($scope, Toc, Cminstance, ParseLinks) {
        $scope.tocs = [];
        $scope.cminstances = Cminstance.query();
        $scope.page = 1;
        $scope.loadAll = function() {
            Toc.query({page: $scope.page, per_page: 20}, function(result, headers) {
                $scope.links = ParseLinks.parse(headers('link'));
                for (var i = 0; i < result.length; i++) {
                    $scope.tocs.push(result[i]);
                }
            });
        };
        $scope.reset = function() {
            $scope.page = 1;
            $scope.tocs = [];
            $scope.loadAll();
        };
        $scope.loadPage = function(page) {
            $scope.page = page;
            $scope.loadAll();
        };
        $scope.loadAll();

        $scope.create = function () {
            Toc.update($scope.toc,
                function () {
                    $scope.reset();
                    $('#saveTocModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            Toc.get({id: id}, function(result) {
                $scope.toc = result;
                $('#saveTocModal').modal('show');
            });
        };

        $scope.delete = function (id) {
            Toc.get({id: id}, function(result) {
                $scope.toc = result;
                $('#deleteTocConfirmation').modal('show');
            });
        };

        $scope.confirmDelete = function (id) {
            Toc.delete({id: id},
                function () {
                    $scope.reset();
                    $('#deleteTocConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.toc = {cloudlayer: null, concretetoc: null, tocdescription: null, tocuri: null, tocid: null, id: null};
        };
    });
