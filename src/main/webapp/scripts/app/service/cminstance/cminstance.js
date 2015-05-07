'use strict';

angular.module('cumuluslabrepoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('cminstanceservice', {
                parent: 'service',
                url: '/cminstanceservice',
                data: {
                    roles: ['ROLE_AL','ROLE_ADMIN'],
                    pageTitle: 'cumuluslabrepoApp.cminstance.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/service/cminstance/cminstances.html',
                        controller: 'CminstanceControllerService'
                    }
                },
                resolve: {
                	
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('cminstanceservice');
                        return $translate.refresh();
                        
                    }]
                    
                }
            })
    });
