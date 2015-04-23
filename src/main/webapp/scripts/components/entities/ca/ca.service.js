'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Ca', function ($resource) {
        return $resource('api/cas/:id', {}, {
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
