class Apple {
    constructor(weight) {
        this.weight = weight;
    }

    getWeight() {
        return this.weight;
    }

    // decrease() {
    //     return this.weight--;
    // }

    isEmpty() {
        if (this.getWeight() > 0) {
            return true;
        }
    }
}


class Human {
    constructor(name, gender, weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    getName() {
        return this.name;
    }

    getWeight() {
        return this.weight;
    }


    checkGender() {
        if (this.gender === true) {
            return "Giới tính Nam";
        } else {
            return "Giới tính Nữ";
        }
    }

    isMale() {
        return this.gender = true;
    }

    isFemale() {
        return this.gender = false;
    }

    eatApple() {
        if (apple.getWeight() > 0) {
            this.weight++;
            apple.weight--
        }
    }

    Say(message) {
        return message;
    }

    checkApple() {
        return apple.getWeight();
    }

}

let adam = new Human('Adam', true, 56);
let eva = new Human('Eva', false, 50);
let apple = new Apple(10);


function callName(name) {
    switch (name) {
        case adam:
            alert('Tôi tên là :' + adam.getName())
            break;
        case eva:
            alert('Tôi tên là :' + eva.getName());
            break;
    }
}

function callGender(name) {
    switch (name) {
        case adam:
            alert('Giới tính tôi là : ' + adam.checkGender())
            break;
        case eva:
            alert('Giới tính tôi là : ' + eva.checkGender())
            break;
    }
}

function hello(name) {
    switch (name) {
        case adam:
            alert(adam.Say('Adam xin chào tất cả bà con !!!'));
            break;
        case eva:
            alert(eva.Say('Eva xin chào tất cả bà con !!!'));
            break;
    }
}

function weightHuman(name) {
    switch (name) {
        case adam:
            alert("Tôi nặng " + adam.getWeight() + "kg");
            break;
        case eva:
            alert("Tôi nặng " + eva.getWeight() + "kg");
            break;
    }
}

function appleUnit() {
    alert('Số táo trên cây là: ' + apple.getWeight());
}

function checkApple(name) {
    switch (name) {

        case adam:
            alert("Số táo:" + adam.checkApple());
            break;
        case eva:
            alert("Số táo:" + eva.checkApple());
            break;
    }
}

function eatApple(name) {
    switch (name) {
        case adam:
            if (apple.isEmpty()) {
                alert("Cân nặng :" + adam.getWeight() +
                    "\nKhối lượng táo:" + apple.getWeight());
            } else {
                alert("Hết táo rồi !!! ăn cái khác đi");
            }
            break;
        case eva:
            if (apple.isEmpty()) {
                alert("Cân nặng :" + eva.getWeight() +
                    "\nKhối lượng táo:" + apple.getWeight());
            } else {
                alert("Hết táo rồi !!! ăn cái khác đi");
            }
            break;
    }
}
