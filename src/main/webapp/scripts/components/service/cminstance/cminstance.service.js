'use strict';

angular.module('cumuluslabrepoApp')
    .factory('CminstanceService', function ($resource) {
        return $resource('service/cminstances/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    });
