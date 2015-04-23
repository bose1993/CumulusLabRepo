'use strict';

angular.module('cumuluslabrepoApp')
    .controller('TocDetailController', function ($scope, $stateParams, Toc, Cminstance) {
        $scope.toc = {};
        $scope.load = function (id) {
            Toc.get({id: id}, function(result) {
              $scope.toc = result;
            });
        };
        $scope.load($stateParams.id);
    });
