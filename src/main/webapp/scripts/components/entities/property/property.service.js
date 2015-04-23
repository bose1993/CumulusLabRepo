'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Property', function ($resource) {
        return $resource('api/propertys/:id', {}, {
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
