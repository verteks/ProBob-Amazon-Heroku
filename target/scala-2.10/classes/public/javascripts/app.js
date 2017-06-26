//Model паттерна MVVM - класс модели для записи, включая три поля и скрытое поле id - полный аналог из модели DB
function File(id, name, url, easyAccess) {
    var self = this;
    self.name = ko.observable(name);
    self.url = ko.observable(url);
    self.easyAccess = ko.observable(easyAccess);
    self.id = id; // не observable поле
    self.easyAccessClass =  ko.computed(function() {
        if (self.easyAccess()){return "btn btn-warning"}else{return "btn btn-success"};
    });
    self.easyAccessText =  ko.computed(function() {
        if (self.easyAccess()){return "Easy access"}else{return "No easy access"};
    });
}

//ViewModel паттерна MVVM, бизнес-логика
function UploadViewModel() {
    var self = this;

    self.files = ko.observableArray([]);


    self.load = function () {
        jsRoutes.controllers.Application.filesJson().ajax({
            dataType: 'json',
            success: function (data) {
                console.log(data);
                console.log("Успешно обработан json запрос. Записи загружены");
                for (i = 0; i < data.length; i++) {
                    self.files.push(new File(data[i].id, data[i].name, data[i].url, data[i].easyAccessFile));
                }
            },
            error: function (data) {
                alert("error! " + data.error);
                console.log('error! Не могу отправить json запрос');
                console.log(data);
            }
        });
    };

     self.reload = function () {
         self.files.destroyAll(); //при удалении работаем с самим объектом notes вместо notes()
        self.load();
     };
    self.removeFile = function (file) {
        $('#myModal').modal('hide')
        var jsonData = ko.toJSON(file);
        console.log(jsonData);
        jsRoutes.controllers.Application.deleteFileJson().ajax({
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: jsonData,
            success: function () {
                console.log("Успешно обработан ajax запрос. Запись удалена");
                self.files.remove(file);
                console.log(self.files());
            },
                         error: function (data) {
                             alert("error! " + data.error);
                             console.log('error! Не могу отправить json запрос');
                             console.log(data);
                         }
        });


    };

    self.changeEasyAccess = function (file) {
        console.log(file.easyAccess());
        if (file.easyAccess()){
            file.easyAccess(false)
        }else{
            file.easyAccess(true)
        }
        var jsonData = ko.toJSON(file);
        console.log(jsonData);
        jsRoutes.controllers.Application.changeEasyAccess().ajax({
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: jsonData,
            success: function () {
                console.log("Успешно обработан ajax запрос. Статус обнавлен");
            },
            error: function (data) {
                alert("error! " + data.error);
                console.log('error! Не могу отправить json запрос');
                console.log(data);
            }
        });


    };

    self.load();
}
//создаем экземпляр ViewModel
var uploadViewModel = new UploadViewModel();
//Запускаем Knockout.JS. Организовываем связывание Model с View через ViewModel
ko.applyBindings(uploadViewModel);

