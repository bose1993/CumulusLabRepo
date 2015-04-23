'use strict';

angular.module('cumuluslabrepoApp')
    .controller('PropertyDetailController', function ($scope, $stateParams, Property, Propertyattribute, Cminstance) {
        $scope.property = {};
        $scope.load = function (id) {
            Property.get({id: id}, function(result) {
              $scope.property = result;
            });
        };
        $scope.load($stateParams.id);
    });
