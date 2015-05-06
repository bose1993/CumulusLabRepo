'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Toc', function ($resource) {
        return $resource('crud/tocs/:id', {}, {
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
