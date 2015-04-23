'use strict';

angular.module('cumuluslabrepoApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
