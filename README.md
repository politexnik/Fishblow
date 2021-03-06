# Fishblow

## Задача:

У Никиты был плоский аквариум с рыбками. В качестве украшения аквариума Никита
использовал кубики, сложенные столбиками. После сильного хлопка дверью у
аквариума выпали боковые стенки. При этом практически вся вода вылилась. Чтобы
определить, не затопил ли Никита соседей снизу нужно посчитать, сколько воды
осталось в аквариуме. Проблема в том, что аквариум очень большой. Ширина и
высота аквариума достигает N=100000 кубиков.
Надо написать программу, которая по заданной конфигурации столбцов определяет
объем оставшейся между кубиками воды.
На вход дается массив целых чисел – последовательная высота столбцов в
аквариуме.
Результатом должно быть число – объем оставшейся воды между кубиками после того
как вся вода слилась.
Например, для массива [4,2,3,2,5,0,1,3] результат должен быть равен 10, как на
картинке ниже.

![fishblow](https://github.com/MaksimTy/Fishblow/blob/master/src/main/resources/icons/fishblow.png)

Объем кубика считать равным 1.

#### Требования к выполнению задания:
* Решение выполняется на языке Java версии 8 (или выше - по желанию)
* Приветствуется решение в объектно-ориентированном стиле
* Должны быть разработаны unit-тесты
##### Бонусы:
Приложение, решающее задачу, имеет графический интерфейс пользователя
(например, на JavaFX или SWT)
