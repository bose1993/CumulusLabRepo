'use strict';

angular.module('cumuluslabrepoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('ca', {
                parent: 'entity',
                url: '/ca',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.ca.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/ca/cas.html',
                        controller: 'CaController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('ca');
                        return $translate.refresh();
                    }]
                }
            })
            .state('caDetail', {
                parent: 'entity',
                url: '/ca/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.ca.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/ca/ca-detail.html',
                        controller: 'CaDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('ca');
                        return $translate.refresh();
                    }]
                }
            });
    });
