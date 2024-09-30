# Зауваження до коду

1. Назву класу **`humanIMB`** змінив на **`HumanBMI`**, щоб дотримуватись правил написання класів (PascalCase).
2. Об'єкт **`humanIMB`** перейменував на **`person`**, щоб уникнути плутанини з назвою класу.
3. Замість **`W`** та **`H`** використав більш зрозумілі назви змінних — **`weight`** та **`height`**.
4. Зробив поля **`weight`**, **`height`** та **`bmi`** приватними для дотримання принципу інкапсуляції.
5. Зробив змінну **`bmi`** нестатичною, оскільки значення ІМТ унікальне для кожного екземпляра класу.
6. Перейменував метод **`Result()`** на **`getResult()`**, щоб він відповідав стандартам іменування методів.
7. Заміняв оператор **`&`** на **`&&`** для оптимізації логічних перевірок.
8. Перейменував змінну **`string`** на **`bmiCategory`**, щоб уникнути плутанини з типом даних **`String`**.
9. Прибрав зайву ініціалізацію **`string = null`** і ініціалізую змінну тільки при присвоєнні значення.
10. Замінював окремі **`if`** на **`else if`**, щоб підвищити ефективність перевірки умов.
11. Додав перевірку у конструкторі, щоб вага і зріст не могли бути нульовими або від’ємними.
12. Перейменував метод **`takeW()`** на **`getWeight()`**, щоб він краще відображав свою функцію.
13. Додав перевірку у метод **`setWeight()`**, щоб не допустити введення нульової або від’ємної ваги.
14. Перейменував метод **`takeH()`** на **`getHeight()`**, щоб назва методу була зрозумілішою.
15. Додав перевірку у метод **`setHeight()`**, щоб не допустити введення нульового або від’ємного зросту.
16. Видалив статичний модифікатор у методі **`takeImt()`**. Метод **takeImt()** є статичним, хоча працює з полями екземпляра класу. Це суперечить принципам об'єктно-орієнтованого програмування.
17. Перейменував метод **`takeImt()`** на **`getBmi()`**, щоб він відповідав стандартам Java.
18. Виніс магічні числа **`18.5`**, **`25`** і **`30`** у константи для покращення читабельності коду.
19. Об'єднав умови в методі **`getResult()`** за допомогою **`else if`** для спрощення логіки.
20. Виправив форматування коду, розставив відступи і правильно розмістив фігурні дужки.
21. Замінив **`humanIMB`** на **`HumanBMI`** у всіх назвах класу, змінних і методів, щоб виправити помилку в абревіатурі .У попередньому варіанті назва класу була **humanIMB**, що є помилкою. Правильна абревіатура — це **BMI** (Body Mass Index).
