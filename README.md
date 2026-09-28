# Доставка еды 🍕

Весь курс мы собираем один проект: логику сервиса доставки еды. Интерфейса не будет, только алгоритмы и классы.

У каждого свой **модуль**, и он ведёт его до конца курса: сначала пишет методы на массивах, потом ускоряет их, потом превращает в классы, а в конце все модули собираются в одну систему «оформить заказ».

## Пары

| Пара | Тема | Задание |
|---|---|---|
| 02 | Методы на массивах: свой модуль | [pairs/02-methods](pairs/02-methods) |
| 03 | Крайние случаи и парное программирование | [pairs/03-pair-programming](pairs/03-pair-programming) |
| 04 | Сколько операций делает алгоритм | [pairs/04-complexity](pairs/04-complexity) |
| 05 | Ускоряем свой модуль | [pairs/05-optimization](pairs/05-optimization) |
| 06 | Из массивов в классы | [pairs/06-classes](pairs/06-classes) |
| 07 | Технический проект | [pairs/07-tech-project](pairs/07-tech-project) |
| 08 | Классы по проекту | [pairs/08-encapsulation](pairs/08-encapsulation) |
| 09 | Заказ: связываем классы | [pairs/09-order](pairs/09-order) |
| 10 | Интерфейсы: разные скидки и тарифы | [pairs/10-interfaces](pairs/10-interfaces) |
| 11 | Собираем всё вместе и разбираем конфликты | [pairs/11-integration](pairs/11-integration) |
| 12 | Демо и итоги | [pairs/12-demo](pairs/12-demo) |

Задание к паре появляется в репозитории **за несколько дней до пары**. Если ссылка не открывается, значит задание ещё не опубликовано.

## Модули

| № | Модуль | Файл | Имя в названии ветки |
|---|---|---|---|
| 1 | Меню | `Menu.java` | `menu` |
| 2 | Корзина | `Cart.java` | `cart` |
| 3 | Промокоды | `Promo.java` | `promo` |
| 4 | Доставка | `Delivery.java` | `delivery` |
| 5 | Время | `Time.java` | `time` |
| 6 | Курьеры | `Couriers.java` | `couriers` |
| 7 | Маршрут | `Route.java` | `route` |
| 8 | Отзывы | `Reviews.java` | `reviews` |
| 9 | Аналитика | `Analytics.java` | `analytics` |

Какой модуль твой, скажет преподаватель на паре 2.

Код лежит в `src/main/java/delivery/`. Общие данные (`DeliveryData.java`) и проверки (`Check.java`) **не меняем**.

## Требования

- JDK 17 или выше
- IntelliJ IDEA (Community подойдёт) или любая другая IDE
- Git и аккаунт на GitHub с доступом к репозиторию курса (преподаватель добавит тебя в Collaborators)

## Установка (один раз)

**1. Представься git'у** (имя латиницей и почта, как на GitHub):

```bash
git config --global user.name "Ivan Ivanov"
git config --global user.email "ivan@example.com"
```

**2. Склонируй репозиторий:**

```bash
git clone https://github.com/vasiliev-pavel/java-course-26-delivery.git
cd java-course-26-delivery
```

**3. Открой папку `java-course-26-delivery` в IntelliJ IDEA** (File → Open).

## Запуск

У каждого модуля есть свой `main` с проверками. Открой файл модуля (например, `Cart.java`) и нажми зелёный треугольник ▶ рядом с `public static void main`.

В консоли увидишь строки:

```
OK    cartTotal({})
FAIL  cartTotal({0, 0, 3})  ожидалось 77000, получено 0
```

`OK` — метод вернул то, что нужно. `FAIL` — нет, и видно, что ожидалось и что получилось.

<details>
<summary>Запуск из терминала (если не IntelliJ)</summary>

```bash
javac -encoding UTF-8 -d out src/main/java/delivery/*.java
java -cp out src.main.java.delivery.Cart
```

Если в консоли Windows вместо русских букв «кракозябры», выполни сначала `chcp 65001`.
</details>

<details>
<summary>IntelliJ подчёркивает package красным</summary>

Правый клик по корневой папке `java-course-26-delivery` → **Mark Directory as → Sources Root**. После этого `package src.main.java.delivery;` станет правильным.
</details>

## Структура проекта

    java-course-26-delivery/
    ├── pairs/                  задания к парам (появляются по одному)
    │   └── 02-methods/
    │       └── README.md
    ├── src/
    │   └── main/
    │       └── java/
    │           └── delivery/
    │               ├── DeliveryData.java   общие данные, НЕ МЕНЯТЬ
    │               ├── Check.java          проверки, НЕ МЕНЯТЬ
    │               ├── Menu.java           модули: у каждого свой
    │               ├── Cart.java
    │               └── ...
    ├── .gitignore
    └── README.md

## Как работаем

На парах **нет интернета**. Всё, что требует сети (`pull`, `fetch`, `push`, Pull Request), делаем дома.

| Дома **до** пары | На паре | Дома **после** пары |
|---|---|---|
| забрать задание и влить его в свою ветку | код, коммиты, `git diff`, `git log` | `git push`, Pull Request, ревью |

### Перед каждой парой (дома)

```bash
git switch main
git pull
git switch cart-ivanova
git merge --no-edit main
```

`cart-ivanova` замени на **свою** ветку (как её назвать, написано в задании пары 2). С пары 7 работаем в ветке группы: `group-a`, `group-b` или `group-c`.

После этого в твоей ветке есть задание новой пары и всё, что преподаватель уже влил в `main`.

### После каждой пары (дома)

```bash
git push
```

Если у тебя **нет открытого** Pull Request из твоей ветки, открой новый (GitHub → **Pull requests** → **New pull request**, base: `main`, compare: твоя ветка). Название — в задании пары.

Если PR прошлой пары **ещё открыт**, новый не создавай: новые коммиты сами появятся в старом PR.

Когда ревью пройдено, преподаватель вливает PR в `main`.

Забыл сделать `git pull` до пары? Подойди к преподавателю, у него есть флешка.

## Правила

- Меняешь **только свои файлы**. Чужие модули не трогаешь, даже если видишь в них ошибку: напиши автору в ревью.
- Пишешь сам. На каждой паре будет небольшая доработка своего кода без подсказок, и если писал сам, она займёт пару минут.
- **Один метод — один коммит**, сообщение по делу: `cart: add cartTotal`, а не `исправил`.
- Перед коммитом смотри `git diff`: в коммит должно попасть только то, что ты хотел.

## Если что-то пошло не так

| Что случилось | Что делать |
|---|---|
| `git pull` пишет про конфликт или `Your local changes would be overwritten` | Ты что-то менял прямо в `main`. Выполни `git stash`, потом снова `git pull`. |
| Сделал коммит не в ту ветку | Не пытайся исправить сам, покажи `git log --oneline --graph` преподавателю. |
| `git merge` открыл редактор с текстом | Ты забыл `--no-edit`. Если это Vim, набери `:wq` и нажми Enter. |
| `git push` пишет `has no upstream branch` | Первый push новой ветки: `git push -u origin имя-ветки`. |
| Проект не компилируется после `git merge` | Проверь, нет ли в файлах строк `<<<<<<<`, `=======`, `>>>>>>>`. Это конфликт, см. пару 11 или подойди к преподавателю. |
