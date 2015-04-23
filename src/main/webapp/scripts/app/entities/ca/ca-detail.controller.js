'use strict';

angular.module('cumuluslabrepoApp')
    .controller('CaDetailController', function ($scope, $stateParams, Ca, Cminstance) {
        $scope.ca = {};
        $scope.load = function (id) {
            Ca.get({id: id}, function(result) {
              $scope.ca = result;
            });
        };
        $scope.load($stateParams.id);
    });
