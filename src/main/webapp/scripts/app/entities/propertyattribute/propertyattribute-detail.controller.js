'use strict';

angular.module('cumuluslabrepoApp')
    .controller('PropertyattributeDetailController', function ($scope, $stateParams, Propertyattribute, Property) {
        $scope.propertyattribute = {};
        $scope.load = function (id) {
            Propertyattribute.get({id: id}, function(result) {
              $scope.propertyattribute = result;
            });
        };
        $scope.load($stateParams.id);
    });
