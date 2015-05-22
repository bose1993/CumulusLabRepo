'use strict';

angular.module('cumuluslabrepoApp')
    .factory('CminstanceService', function ($resource) {
        return $resource('service/cminstances/', {}, {
            'send': { method:'POST' }
        });
    });

angular.module('cumuluslabrepoApp')
.factory('CanonicalizeService', function ($resource) {
    return $resource('service/cminstances/canonicalize', {}, {
        'canonicalize': { method:'POST' }
    });
});
