'use strict';

angular.module('cumuluslabrepoApp')
    .controller('CaController', function ($scope, Ca, Cminstance, ParseLinks,Principal) {
        $scope.cas = [];
        $scope.cminstances = Cminstance.query();
        $scope.isInRole = Principal.isInRole;
        $scope.page = 1;
        $scope.loadAll = function() {
            Ca.query({page: $scope.page, per_page: 20}, function(result, headers) {
                $scope.links = ParseLinks.parse(headers('link'));
                for (var i = 0; i < result.length; i++) {
                    $scope.cas.push(result[i]);
                }
            });
        };
        $scope.reset = function() {
            $scope.page = 1;
            $scope.cas = [];
            $scope.loadAll();
        };
        $scope.loadPage = function(page) {
            $scope.page = page;
            $scope.loadAll();
        };
        $scope.loadAll();

        $scope.create = function () {
            Ca.update($scope.ca,
                function () {
                    $scope.reset();
                    $('#saveCaModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            Ca.get({id: id}, function(result) {
                $scope.ca = result;
                $('#saveCaModal').modal('show');
            });
        };

        $scope.delete = function (id) {
            Ca.get({id: id}, function(result) {
                $scope.ca = result;
                $('#deleteCaConfirmation').modal('show');
            });
        };

        $scope.confirmDelete = function (id) {
            Ca.delete({id: id},
                function () {
                    $scope.reset();
                    $('#deleteCaConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.ca = {name: null, uri: null, id: null};
        };
    });
