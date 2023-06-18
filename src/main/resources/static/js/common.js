$('body').on('click', '#btn-update-user', function (e) {
    e.preventDefault();
    $.ajax({
        url: '/m-user/add-or-update-user',
        type: 'post',
        processData: false,
        data: $('form#updateMUser').serialize()
    }).done(function () {
        window.location = "/m-user?page=" + page;
    })
})

$('body').on('keypress', '#findLesson', function (e) {
    if (e.key === "Enter") {
        let lesson = document.getElementById("findLesson").value;
        e.preventDefault();
        $.ajax({
            url: '/home/vocabulary/'+lesson,
            type: 'get',
            processData: false
        }).done(function (data) {
            $('#content').replaceWith(htmlMarkupToNode(data));
            document.getElementById("findLesson").value = lesson;
        })
    }

})

$('body').on('click', '#firstRomaji', function (e) {
    e = e || window.event;
    let target = e.target || e.srcElement;
    target.style.display = 'none';
    document.getElementById("secondRomaji").removeAttribute("style");

})

$('body').on('click', '#firstJapan', function (e) {
    e = e || window.event;
    let target = e.target || e.srcElement;
    target.style.display = 'none';
    document.getElementById("secondJapan").removeAttribute("style");

})

function refresh(){
    let lesson = document.getElementById("findLesson").value;
    $.ajax({
        url: '/home/random-vocabulary',
        type: 'get',
        processData: false
    }).done(function (data) {
        $('#content').replaceWith(htmlMarkupToNode(data));
        document.getElementById("findLesson").value = lesson;
    })
}

function getVocabulary(e){
    const collection = document.getElementsByClassName("menu__item");
    for (let i = 0; i < collection.length; i++) {
        collection[i].style.backgroundColor = "";
    }
    e = e || window.event;
    let target = e.target || e.srcElement;
    target.style.backgroundColor = "#58b4ff";

    $.ajax({
        url: '/home/vocabulary',
        type: 'get',
        processData: false
    }).done(function (data) {
        $('#content').replaceWith(htmlMarkupToNode(data));
    })

}

$('#btn-save-vocabulary').click(function (e) {
    e.preventDefault();
    $.ajax({
        url: '/admin/add-vocabulary',
        type: 'post',
        processData: false,
        data: $('form#add-vocabulary').serialize()
    }).done(function () {
        window.location = "/admin"
    }).fail(function (xhr, status, error){

    })
})


//function parse html string into node
function htmlMarkupToNode(html) {
    let template = document.createElement("template");
    template.innerHTML = html;
    return template.content.cloneNode(true);
}