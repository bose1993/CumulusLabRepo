'use strict';

angular.module('cumuluslabrepoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('cminstance', {
                parent: 'entity',
                url: '/cminstance',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.cminstance.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/cminstance/cminstances.html',
                        controller: 'CminstanceController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('cminstance');
                        return $translate.refresh();
                    }]
                }
            })
            .state('cminstanceDetail', {
                parent: 'entity',
                url: '/cminstance/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.cminstance.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/cminstance/cminstance-detail.html',
                        controller: 'CminstanceDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('cminstance');
                        return $translate.refresh();
                    }]
                }
            });
    });
