'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Propertyattribute', function ($resource) {
        return $resource('api/propertyattributes/:id', {}, {
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
