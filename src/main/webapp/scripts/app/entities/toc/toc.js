'use strict';

angular.module('cumuluslabrepoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('toc', {
                parent: 'entity',
                url: '/toc',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.toc.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/toc/tocs.html',
                        controller: 'TocController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('toc');
                        return $translate.refresh();
                    }]
                }
            })
            .state('tocDetail', {
                parent: 'entity',
                url: '/toc/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.toc.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/toc/toc-detail.html',
                        controller: 'TocDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('toc');
                        return $translate.refresh();
                    }]
                }
            });
    });
