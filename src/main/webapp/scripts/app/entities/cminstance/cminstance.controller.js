'use strict';

angular.module('cumuluslabrepoApp')
    .controller('CminstanceController', function ($scope, Cminstance, Ca, Toc, Property, ParseLinks) {
        $scope.cminstances = [];
        $scope.cas = Ca.query();
        $scope.tocs = Toc.query();
        $scope.propertys = Property.query();
        $scope.page = 1;
        $scope.loadAll = function() {
            Cminstance.query({page: $scope.page, per_page: 20}, function(result, headers) {
                $scope.links = ParseLinks.parse(headers('link'));
                for (var i = 0; i < result.length; i++) {
                    $scope.cminstances.push(result[i]);
                }
            });
        };
        $scope.reset = function() {
            $scope.page = 1;
            $scope.cminstances = [];
            $scope.loadAll();
        };
        $scope.loadPage = function(page) {
            $scope.page = page;
            $scope.loadAll();
        };
        $scope.loadAll();

        $scope.create = function () {
            Cminstance.update($scope.cminstance,
                function () {
                    $scope.reset();
                    $('#saveCminstanceModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            Cminstance.get({id: id}, function(result) {
                $scope.cminstance = result;
                $('#saveCminstanceModal').modal('show');
            });
        };

        $scope.delete = function (id) {
            Cminstance.get({id: id}, function(result) {
                $scope.cminstance = result;
                $('#deleteCminstanceConfirmation').modal('show');
            });
        };

        $scope.confirmDelete = function (id) {
            Cminstance.delete({id: id},
                function () {
                    $scope.reset();
                    $('#deleteCminstanceConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.cminstance = {modelid: null, templateid: null, xml: null, id: null};
        };
    });
