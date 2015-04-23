'use strict';

angular.module('cumuluslabrepoApp')
    .factory('Password', function ($resource) {
        return $resource('api/account/change_password', {}, {
        });
    });
