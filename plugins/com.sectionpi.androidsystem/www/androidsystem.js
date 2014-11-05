
var argscheck = require('cordova/argscheck'),
    utils = require('cordova/utils'),
    exec = require('cordova/exec');

var AndroidSystem = function() {
};

AndroidSystem.alert = function(){

	console.log("alert js cagırıldı");

	exec(null,null,"AndroidSystem","alert",["deneme"]);
}



module.exports = AndroidSystem;



