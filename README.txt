1) "@RequestMapping("/bye")" odpowiada za wyświetlenie endpointa www.strona-internetowa.pl/endpoint.;
2) Dodanie nowe endpointa odbywa się w ten sam sposób, jedyna różnica to kod znajdujący się "@RequestMapping("/homepage")",;
odpowiadający za to jaki komunikat pojawi się na stronie internetowej.;
3) Dzięki adnotacji "@RequestParam" dodałem do zwracanych parametrów w JSON'ie wiek osoby.;
4) To zadanie wykonałem analogicznie do pozostałych, odpowiednio zedytowałem "template", a następnie w konstruktorze;
klasy "Greeting" zawarłem wszystkie parametry, czyli imię, id oraz wiek osoby.
5) Klasa "Gender" korzysta z andotacji "@Component", która jest zarządza przez bilbiotekę Spring i automatycznie tworzy bean'y,;
czyli obiekt tworzący "rdzeń" naszego programu. I tutaj się pogubiłem.