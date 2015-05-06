'use strict';

angular.module('cumuluslabrepoApp')
    .controller('PropertyattributeController', function ($scope, Propertyattribute, Property, ParseLinks,Principal,Principal) {
        $scope.propertyattributes = [];
        $scope.propertys = Property.query();
        $scope.isInRole = Principal.isInRole;
        $scope.page = 1;
        $scope.loadAll = function() {
            Propertyattribute.query({page: $scope.page, per_page: 20}, function(result, headers) {
                $scope.links = ParseLinks.parse(headers('link'));
                for (var i = 0; i < result.length; i++) {
                    $scope.propertyattributes.push(result[i]);
                }
            });
        };
        $scope.reset = function() {
            $scope.page = 1;
            $scope.propertyattributes = [];
            $scope.loadAll();
        };
        $scope.loadPage = function(page) {
            $scope.page = page;
            $scope.loadAll();
        };
        $scope.loadAll();

        $scope.create = function () {
            Propertyattribute.update($scope.propertyattribute,
                function () {
                    $scope.reset();
                    $('#savePropertyattributeModal').modal('hide');
                    $scope.clear();
                });
        };

        $scope.update = function (id) {
            Propertyattribute.get({id: id}, function(result) {
                $scope.propertyattribute = result;
                $('#savePropertyattributeModal').modal('show');
            });
        };

        $scope.delete = function (id) {
            Propertyattribute.get({id: id}, function(result) {
                $scope.propertyattribute = result;
                $('#deletePropertyattributeConfirmation').modal('show');
            });
        };

        $scope.confirmDelete = function (id) {
            Propertyattribute.delete({id: id},
                function () {
                    $scope.reset();
                    $('#deletePropertyattributeConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.propertyattribute = {name: null, value: null, id: null};
        };
    });
