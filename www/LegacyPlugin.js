var exec = require('cordova/exec');

exports.invokeFAD = function (arg0, success, error) {
    exec(success, error, 'LegacyPlugin', 'invokeFAD', [arg0]);
};

exports.getIdRequisitionFAD = function (arg0, success, error) {
    exec(success, error, 'LegacyPlugin', 'getIdRequisitionFAD', [arg0]);
};
