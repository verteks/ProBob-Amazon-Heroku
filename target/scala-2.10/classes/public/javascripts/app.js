//Model паттерна MVVM - класс модели для записи, включая три поля и скрытое поле id - полный аналог из модели DB
function Note(id, name, homePhone, cellPhone) {
    var self = this;
    self.name = ko.observable(name);
    self.homePhone = ko.observable(homePhone);
    self.cellPhone = ko.observable(cellPhone);
    self.id = id; // не observable поле
}

//ViewModel паттерна MVVM, бизнес-логика
function UploadViewModel() {
    var self = this;

    // Список записей
    self.s3Bucket = ko.observable("");

    self.load = function () {
        jsRoutes.controllers.AmazonUpload.getInfo.ajax({
            dataType: 'json',
            success: function (data) {
                console.log("Успешно обработан json запрос. Записи загружены");
               self.s3Bucket(data);
            },
            error: function (data) {
                alert("error! " + data.error);
                console.log('error! Не могу отправить json запрос');
                console.log(data);
            }
        });
    };

    // self.reload = function () {
    //     self.notes.destroyAll(); //при удалении работаем с самим объектом notes вместо notes()
    //     self.load();
    // };
    // self.cleanForm = function () {
    //     self.name("");
    //     self.cellPhone("");
    //     self.homePhone("");
    //     self.id(null)
    // };
    // self.editNote = function (note) {
    //     console.log(note);
    //     self.id(note.id);
    //     self.name(note.name());
    //     self.cellPhone(note.cellPhone());
    //     self.homePhone(note.homePhone());
    // };
    // self.removeNote = function (note) {
    //     var jsonData = ko.toJSON(note);
    //     console.log(jsonData);
    //     //запрашиваем сервер
    //     jsRoutes.controllers.Application.deleteNoteJson().ajax({
    //         dataType: 'json',
    //         contentType: 'application/json; charset=utf-8',
    //         data: jsonData,
    //         success: function () {
    //             console.log("Успешно обработан ajax запрос. Запись удалена");
    //             self.notes.remove(note);
    //         },
    //                      error: function (data) {
    //                          alert("error! " + data.error);
    //                          console.log('error! Не могу отправить json запрос');
    //                          console.log(data);
    //                      }
    //     });
    //
    //
    // };
    //
    // /*
    //  Функция сохранения формы. Записи, содержащейся в форме. И для редактирования и для добавления новой записи.
    //  */
    // self.saveNote = function () {
    //     alert("asdasd");
    //     //Получаем объект Note из observable полей формы
    //     var note = new Note; //todo, использовать self.id() и др.
    //        note.id = self.id();
    //        note.name(self.name());
    //        note.cellPhone(self.cellPhone());
    //        note.homePhone(self.homePhone());
    //     //Преобразовываем в json-строку с помощью функции ko.toJSON
    //     var jsonData = ko.toJSON(note); //todo
    //     console.log(jsonData);
    //
    //     //уведомляем сервер  с помощью JavaScript объекта, позволяющего осуществить AJAX к контролеру
    //     jsRoutes.controllers.Application.saveNoteJson().ajax({
    //         dataType: 'json',   //
    //         contentType: 'application/json; charset=utf-8',
    //         data: jsonData,
    //         success: function (data) {
    //             console.log("Успешно обработан ajax запрос. Запись добавлена в DB");
    //             console.log(data);
    //
    //             //обновляем данные локально
    //             if (note.id == null){
    //             var isNew = true;}
    //              else
    //              {
    //              var isNew = false;
    //              }
    //              //todo флаг, является ли данная запись в форме - новой записью. Если редактируемая - выдает false
    //
    //             if (isNew) { /*создание нового */
    //                note.id = data.id;
    //                self.notes.push(note);
    //             } else {
    //                 //todo редактирование - ищем и обновляем
    //                 console.log(self.notes());
    //                 for (i = 0; i < self.notes().length; i++) {
    //                     var found = false; //todo исправить на корректное условие
    //                     if (note.id == self.notes()[i].id) {
    //                         self.notes()[i].name(data.name);
    //                         self.notes()[i].cellPhone(data.cellPhone);
    //                         self.notes()[i].homePhone(data.homePhone);
    //                         //todo обновить аналогично остальные поля.
    //
    //                         console.log(self.notes()[i]);
    //                         break;
    //                     }
    //                 }
    //             }
    //
    //             //обновляем (очищаем) форму
    //             self.cleanForm();
    //         },    error: function (data) {
    //                                       alert("error! " + data.error);
    //                                       console.log('error! Не могу отправить json запрос');
    //                                       console.log(data);
    //                                   }
    //         //todo обработка ошибок от сервера
    //     });
    // };


    //вызов первоначальной загрузки данных от сервера.
    self.load();
}
//создаем экземпляр ViewModel
var uploadViewModel = new UploadViewModel();
//Запускаем Knockout.JS. Организовываем связывание Model с View через ViewModel
ko.applyBindings(uploadViewModel);

