'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


