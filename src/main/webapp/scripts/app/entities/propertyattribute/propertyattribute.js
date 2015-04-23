'use strict';

angular.module('cumuluslabrepoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('propertyattribute', {
                parent: 'entity',
                url: '/propertyattribute',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.propertyattribute.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/propertyattribute/propertyattributes.html',
                        controller: 'PropertyattributeController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('propertyattribute');
                        return $translate.refresh();
                    }]
                }
            })
            .state('propertyattributeDetail', {
                parent: 'entity',
                url: '/propertyattribute/:id',
                data: {
                    roles: ['ROLE_USER'],
                    pageTitle: 'cumuluslabrepoApp.propertyattribute.detail.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/entities/propertyattribute/propertyattribute-detail.html',
                        controller: 'PropertyattributeDetailController'
                    }
                },
                resolve: {
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('propertyattribute');
                        return $translate.refresh();
                    }]
                }
            });
    });
