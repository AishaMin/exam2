package game;

import java.util.Scanner;

public  class Game {

    public static Paragraph needForSaveParagraph = new Paragraph();

    public static void paragraph(String paragraphName) {


        if (paragraphName == "Лисенок") {
            String paragraphText = "'Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком.\n" +
                    " Это утро не было исключением. Лисёнок пришёл на их обычное место встречи,\n" +
                    " но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга.\n" +
                    " \" Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду.\"\n" +
                    " - подумал Лисёнок. Как поступить Лисенку?'";

            Paragraph paragraph01 = new Paragraph("Вернуться домой");
            Paragraph paragraph02 = new Paragraph("Отправиться на поиски");
            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");
            Paragraph paragraph1 = new Paragraph();
            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraph1.setParagraphName("Вернуться домой");
            } else if (paragraph == 2) {
               paragraph1.setParagraphName("Отправиться на поиски");
            } else {System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");}
            Game.paragraph(paragraph1.getParagraphName());

        } else if (paragraphName == "Вернуться домой" || paragraphName == "Может быть он прав и Лисёнок просто паникует"
                || paragraphName == "Волк прав") {

            needForSaveParagraph.setParagraphName("Вернуться домой");

            String paragraphText = "'Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл \n" +
                    "на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка,\n" +
                    " но они разминулись. Наконец-то друзья нашли друг друга!\n" +
                    " Игра завершилась успехом'";
            System.out.println(paragraphText);


        } else if (paragraphName == "Отправиться на поиски") {

            needForSaveParagraph.setParagraphName("Отправиться на поиски");

            String paragraphText = "'Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка \n" +
                    "и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать.\n" +
                    " Помогите ему.'";

            Paragraph paragraph01 = new Paragraph("Попытаться разузнать о Бельчонке у лесных жителей");
            Paragraph paragraph02 = new Paragraph("Искать Бельчонка в одиночку");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Попытаться разузнать о Бельчонке у лесных жителей";
            } else if (paragraph == 2) {
                paragraphName = "Искать Бельчонка в одиночку";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        } else if (paragraphName == "Попытаться разузнать о Бельчонке у лесных жителей") {

            needForSaveParagraph.setParagraphName("Попытаться разузнать о Бельчонке у лесных жителей");

            String paragraphText = "'Пока Лисёнок принимал решение, лесные жители разошлись кто куда. \n" +
                    "Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно\n" +
                    " разозлиться из-за расспросов. Кого выбрать?'";

            Paragraph paragraph01 = new Paragraph("Расспросить Сову");
            Paragraph paragraph02 = new Paragraph("Расспросить Волка");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Расспросить Сову";
            } else if (paragraph == 2) {
                paragraphName = "Расспросить Волка";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            paragraph(paragraphName);

        } else if (paragraphName == "Искать Бельчонка в одиночку" ||
                paragraphName == "Медвежонок ничего не знает, нужно продолжить поиски" ||
                paragraphName == "Нет, потрачено слишком много времени, нужно идти дальше" ||
                paragraphName == "Сове не стоит верить") {

            String paragraphText = "'Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил," +
                    " как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей :('";
            System.out.println(paragraphText);


        } else if (paragraphName == "Расспросить Сову") {

            needForSaveParagraph.setParagraphName("Расспросить Сову");

            String paragraphText = "'Сова долго не хотела говорить, но в итоге сказала, что видела испуганного\n" +
                    " Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно,\n" +
                    " если Бельчонок там, ему срочно нужна помощь.\n'";

            Paragraph paragraph01 = new Paragraph("Поверить Сове и отправиться вглубь леса");
            Paragraph paragraph02 = new Paragraph("Сове не стоит верить");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Поверить Сове и отправиться вглубь леса";
            } else if (paragraph == 2) {
                paragraphName = "Сове не стоит верить";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        } else if (paragraphName == "Расспросить Волка") {

            needForSaveParagraph.setParagraphName("Расспросить Волка");

            String paragraphText = "'Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому\n" +
                    " лисенку не стоит бродить по лесу одному. И как теперь поступить?'";

            Paragraph paragraph01 = new Paragraph("Волк прав");
            Paragraph paragraph02 = new Paragraph("Искать Бельчонка в одиночку");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Волк прав";
            } else if (paragraph == 2) {
                paragraphName = "Искать Бельчонка в одиночку";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        } else if (paragraphName == "Поверить Сове и отправиться вглубь леса") {

            needForSaveParagraph.setParagraphName("Поверить Сове и отправиться вглубь леса");

            String paragraphText = "'В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов\n" +
                    " рассказать все, что знает, если Лисёнок принесёт ему мёда.'";

            Paragraph paragraph01 = new Paragraph("Нет, потрачено слишком много времени, нужно идти дальше");
            Paragraph paragraph02 = new Paragraph("Нужно воспользоваться шансом и раздобыть мёд");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Нет, потрачено слишком много времени, нужно идти дальше";
            } else if (paragraph == 2) {
                paragraphName = "Нужно воспользоваться шансом и раздобыть мёд";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        } else if (paragraphName == "Нужно воспользоваться шансом и раздобыть мёд") {

            needForSaveParagraph.setParagraphName("Нужно воспользоваться шансом и раздобыть мёд");

            String paragraphText = "'Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. " +
                    "Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.'";

            Paragraph paragraph01 = new Paragraph("Подождать, вдруг пчёлы улетят");
            Paragraph paragraph02 = new Paragraph("Нужно попытаться выкрасть мёд немедленно");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Подождать, вдруг пчёлы улетят";
            } else if (paragraph == 2) {
                paragraphName = "Нужно попытаться выкрасть мёд немедленно";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        } else if (paragraphName == "Подождать, вдруг пчёлы улетят") {

            needForSaveParagraph.setParagraphName("Подождать, вдруг пчёлы улетят");

            String paragraphText = "'Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда.\n" +
                    " Вдруг он понял, что очень голоден. Что же делать?'";

            Paragraph paragraph01 = new Paragraph("Поесть немного и передохнуть");
            Paragraph paragraph02 = new Paragraph("Скорее отнести мёд Медвежонку");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Поесть немного и передохнуть";
            } else if (paragraph == 2) {
                paragraphName = "Скорее отнести мёд Медвежонку";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        } else if (paragraphName == "Нужно попытаться выкрасть мёд немедленно") {
            String paragraphText = "'Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь.\n" +
                    " Игра завершилась неудачей :('";
            System.out.println(paragraphText);

        } else if (paragraphName == "Поесть немного и передохнуть") {
            String paragraphText = "'Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь,\n" +
                    " он не сможет продолжить поиски. Игра завершилась неудачей'";
            System.out.println(paragraphText);


        } else if (paragraphName == "Скорее отнести мёд Медвежонку") {

            needForSaveParagraph.setParagraphName("Скорее отнести мёд Медвежонку");

            String paragraphText = "'Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок \n" +
                    "и уверен, что Бельчонок никогда не пошёл бы в глубь леса.\n" +
                    " Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, \n" +
                    "он также уговаривал Лисёнка вернуться домой.'";

            Paragraph paragraph01 = new Paragraph("Медвежонок ничего не знает, нужно продолжить поиски");
            Paragraph paragraph02 = new Paragraph("Может быть он прав и Лисёнок просто паникует");

            System.out.println(paragraphText + "\n" + "1. " + paragraph01.getParagraphName() + "\n" + "2. "
                    + paragraph02.getParagraphName());

            System.out.println("Введите 0 (выход в меню), 1 или 2");

            Scanner in = new Scanner(System.in);
            int paragraph = in.nextInt();
            if (paragraph == 0) {
                return;
            } else if (paragraph == 1) {
                paragraphName = "Медвежонок ничего не знает, нужно продолжить поиски";
            } else if (paragraph == 2) {
                paragraphName = "Может быть он прав и Лисёнок просто паникует";
            } else System.out.println("Таких вариантов ответа не существует, введите 0, 1 или 2");
            Game.paragraph(paragraphName);

        }

    }

}
