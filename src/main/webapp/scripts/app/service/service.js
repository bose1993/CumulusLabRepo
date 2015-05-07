'use strict';

angular.module('cumuluslabrepoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('service', {
                abstract: true,
                parent: 'site'
            });
    });
