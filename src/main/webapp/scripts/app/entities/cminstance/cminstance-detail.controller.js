'use strict';

angular.module('cumuluslabrepoApp')
    .controller('CminstanceDetailController', function ($scope, $stateParams, Cminstance, Ca, Toc, Property, User) {
        $scope.cminstance = {};
        $scope.load = function (id) {
            Cminstance.get({id: id}, function(result) {
              $scope.cminstance = result;
            });
        };
        $scope.load($stateParams.id);
    });
