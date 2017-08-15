# Javascript-on-Kotlin Test Application

Тестовое приложение на Kotlin JS

## Подготовка IDE

1. Создать Gradle Run Config для билда kotlin-js и стилей. Ключ `continuous` включит опцию продолжительной сборки - будет выполняться отслеживание за изменением файлов и повторная сборка:
	> Gradle project = выбрать проект
	> Tasks = build gzipCss
	> Script parametres = --continuous
	
2. Запустить созданную задачу

3. Теперь запускаем index.html - ПКМ по файлу index.html, затем Open in browser

4. После запуска index.html можно сохранить Run Config.

## Что если

... браузер не видит стили и скрипты
> на путь, откуда браузер ищет файлы скриптов и стилей, влияет URL запуска Run Config index.html. Я запускал со значением URL = `http://localhost:63342/kotlin-test/index.html`