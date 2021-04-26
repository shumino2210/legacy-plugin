var exec = require('cordova/exec');

exports.initProcess = function (arg0, success, error) {
    exec(success, error, 'LegacyPlugin', 'initProcess', [arg0]);
};
