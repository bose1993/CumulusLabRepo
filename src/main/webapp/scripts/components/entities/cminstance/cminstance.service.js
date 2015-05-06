'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Cminstance', function ($resource) {
        return $resource('crud/cminstances/:id', {}, {
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
