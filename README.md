## Codestyle mistakes:
>Тут ще є декілька не codestyle помилки, але я їх включила до виправлень`

1. Top-level класи повинні знаходитись в оремих файлах, так як HumanIMB не є вбудованим класом, виносимо його в окремий 
файл
2. Назва класу повинна починатись з великої літери (humanIMB -> HumanIMB)
3. Змінні згідно camelCase повинні починатись з малої літери 
4. Назви змінної повинні відображати суть і завдання змінної (w -> weight, h -> height)
5. private static double imb - статичні змінні використовують для змінних, які належать не до
екземпляру об'єкту, а для екземпляра класу. Але значення IMB буде змінюватись в залежності від
полів об'єкту. Тому потрібно зробити поле ibm не статичним, а звичайним полем класу. 
6. Потрібно вказувати також зрозумілі назви змінних в параметрах методу (public HumanIMB(double w -> weight, double h -> height))
7. Використовувати в конструкторі ключове слово this для посилання на змінні об'єкту (this.weight = weight;
   this.height = height;)
8. Методи, які повертають значення поля класу (геттери) повинні називатись get...(). Тому
   takeW() -> getWeight, takeH() -> getHeight(),takeImt() -> getIMB() . 
9. Методи, які встановлюють значення поля класу (сеттери) повинні називатись get...(). Тому
   putW(double w) -> setWeight(double weight), setH(double h) -> setHeight(double height). 
10. В if умовах пропущено один пробіл після операторів порівняння  (imb >=18.5 & imb <25) -> (imb >= 18.5 & imb < 25)
11. Оператор & під час порівняння не перевіряє другу частину умови, якщо перша частина true. Оскільки це - 
бітовий оператор. 
12. Щоб спростити код і уникнути лишнього завантаження пам'яті і виконання зайвих перевірок, можна або змінити
умовний оператор if на if-else, тоді якщо одна умова буде правильна, нам не потрібно буде перевіряти всі інші 
можливі випадки. Або якщо залишити if - не присвоювати значення змінній string, а одразу повертати значення за допомогою 
return 
13. Назва методу Result() не є зрозумілою, з назви не можна зрозуміти, що робить цей метод. А також назва написана з
з великої літери. Змінимо назву з Result() -> checkIMB(). А також, оскільки результати виконання цього методу залежать 
від екземпляра класу, а не самого класу приберемо static 
14. Назва String string - незрозуміла, потрібно перейменувати її на personIBM 
15. Після полів класу і методів потрібно робити один порожній рядок.

А також я б зробила поля weight i height приватними.