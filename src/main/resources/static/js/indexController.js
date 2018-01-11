/**
 * Created by Kamui on 11.01.2018.
 */

angular.module('index', []);
angular.module('index')
    .controller('main', function ($scope, $http, $timeout) {

        $scope.inputText = "";

        getComments();

        function getComments(){
            $http.get("/comments").then(function (response) {
                $scope.comments = response.data.slice().reverse();
                /*
                for(var i=0; i < $scope.comments.length; i++){
                    $scope.comments[i].interimText = "";
                }
                */
            });
        }

        $scope.post = function (text){
            if(text == ""){
                $scope.inputText = "Bitte geben Sie eine Nachricht ein";
                $timeout(function(){
                    $scope.inputText = "";
                },1000)
            }
            else{
                $http.post("/comments", {"text": text}).then(function(response){
                    getComments();
                })
            }
        }

        $scope.delete = function (comment){
            $http.delete("/comments/" + comment.id).then(function(response){
                getComments();
            })
        }

        $scope.editComment = function(comment){
            console.log(angular.copy(comment));
            comment.text = comment.interimText;
            delete comment.interimText;
            $http.put("/comments",comment).then(function () {
                getComments();
            });
        }


    });