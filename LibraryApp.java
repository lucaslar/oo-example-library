public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library("Prog1-Lib", 2023, 20);
        System.out.println(library);

        final Dvd starWars = starWarsDvd();
        library.addMediumToInventory(starWars);

        final Book[] techBooks = techBooks();
        for (Medium m : techBooks) {
            boolean successful = library.addMediumToInventory(m);
            if (successful) {
                System.out.println("Successfully added '" + m.getTitle() + "' to " + library.getName() + ".");
            } else {
                System.out.println("Couldn't add '" + m.getTitle() + "' to " + library.getName() + "...seems like the library's inventory is full.");
            }
        }

        System.out.println();
        library.listInventory();

        System.out.println();
        final Medium littlePrince = library.findMediumByTitle("The little Prince");
        final Medium buildingMicroservices = library.findMediumByTitle("Building Microservices: Designing Fine-Grained Systems");
        System.out.println("Little Prince found? " + (littlePrince != null));
        System.out.println("Building Microservices found? " + (buildingMicroservices != null));

        LibraryUser user = new LibraryUser("Max", "Mustermann", "LIB-123");
        boolean borrowingSuccessful = user.borrowMedium(buildingMicroservices);
        if (borrowingSuccessful) {
            System.out.println("Successfully borrowed '" + buildingMicroservices.getTitle() + "'");
            System.out.println("Now available instances of the book: " + buildingMicroservices.getAvailableInstances());
            System.out.println("Returning the book...");
            buildingMicroservices.returnMedium();
            System.out.println("Now available instances of the book: " + buildingMicroservices.getAvailableInstances());
        }
    }

    private static Dvd starWarsDvd() {
        Person carrieFisher = new Person("Carrie", "Fisher");
        Person markHamill = new Person("Mark", "Hamill");
        Person harrisonFord = new Person("Harrison", "Ford");
        Person sirAlecGuinness = new Person("Sir", "Alec", "Guinness");
        Person[] actors = {carrieFisher, markHamill, harrisonFord, sirAlecGuinness};
        Dvd starWars = new Dvd("Star Wars", 1977, 12, new Person("George", "Lucas"), actors, 105);
        starWars.setDescription("A long time ago, in a galaxy far far away ...");
        return starWars;
    }

    private static Book[] techBooks() {
        Person adamBellemare = new Person("Adam", "Bellemare");
        Person benStopford = new Person("Ben", "Stopford");
        Person bruceMorgan = new Person("Bruce", "Morgan");
        Person bobbyWoolf = new Person("Bobby", "Woolf");
        Person chrisRichardson = new Person("Chris", "Richardson");
        Person corneliaDavis = new Person("Cornelia", "Davis");
        Person ericEvans = new Person("Eric", "Evans");
        Person gregorHohpe = new Person("Gregor", "Hohpe");
        Person jamesUrquhart = new Person("James", "Urquhart");
        Person johnArundel = new Person("John", "Arundel");
        Person justinDomingus = new Person("Justin", "Domingus");
        Person kasunIndrasiri = new Person("Kasun", "Indrasiri");
        Person kinnaryJangla = new Person("Kinnary", "Jangla");
        Person lucaMezzalira = new Person("Luca", "Mezzalira");
        Person markRichards = new Person("Mark", "Richards");
        Person martinKleppmann = new Person("Martin", "Kleppmann");
        Person michaelGeers = new Person("Michael", "Geers");
        Person moisesMaceroGarcia = new Person("Moisés", "Macero García");
        Person nealFord = new Person("Neal", "Ford");
        Person pauloPereira = new Person("Paulo", "Pereira");
        Person prabathSiriwardena = new Person("Prabath", "Siriwardena");
        Person pramodSadalage = new Person("Pramod", "Sadalage");
        Person samNewman = new Person("Sam", "Newman");
        Person zhamakDehghani = new Person("Zhamak", "Dehghani");

        Person[] enterpriseIntegrationPatternsAuthors = {gregorHohpe, bobbyWoolf};
        Person[] cloudNativeDevOpsWithKubernetesAuthors = {johnArundel, justinDomingus};
        Person[] microservicesInActionAuthors = {bruceMorgan, pauloPereira};
        Person[] softwareArchitectureTheHardPartsAuthors = {nealFord, markRichards, pramodSadalage, zhamakDehghani};
        Person[] fundamentalsOfSoftwareArchitectureAuthors = {nealFord, markRichards};
        Person[] microservicesForTheEnterpriseAuthors = {kasunIndrasiri, prabathSiriwardena};

        Book[] bookArray = new Book[20];
        bookArray[0] = new Book("Building Microservices: Designing Fine-Grained Systems", 2021, 12, samNewman, 586);
        bookArray[1] = new Book("Monolith to Microservices: Evolutionary Patterns to Transform Your Monolith", 2019, 6, samNewman, 255);
        bookArray[2] = new Book("Domain-Driven Design: Tackling Complexity in the Heart of Software", 2003, 7, ericEvans, 560);
        bookArray[3] = new Book("Enterprise Integration Patterns: Designing, Building, and Deploying Messaging Solutions", 2003, 5, enterpriseIntegrationPatternsAuthors, 480);
        bookArray[4] = new Book("Microservices Patterns: With examples in Java", 2018, 10, chrisRichardson, 522);
        bookArray[5] = new Book("Cloud Native Patterns: Designing change-tolerant software", 2019, 8, corneliaDavis, 400);
        bookArray[6] = new Book("Designing Data-Intensive Applications: The Big Ideas Behind Reliable, Scalable, and Maintainable Systems", 2017, 10, martinKleppmann, 590);
        bookArray[7] = new Book("Cloud Native DevOps with Kubernetes: Building, Deploying, and Scaling Modern Applications in the Cloud", 2022, 3, cloudNativeDevOpsWithKubernetesAuthors, 325);
        bookArray[8] = new Book("Building Event-Driven Microservices: Leveraging Organizational Data at Scale", 2020, 7, adamBellemare, 304);
        bookArray[9] = new Book("Microservices in Action", 2018, 4, microservicesInActionAuthors, 392);
        bookArray[10] = new Book("Software Architecture: The Hard Parts: Modern Trade-Off Analyses for Distributed Architectures", 2021, 13, softwareArchitectureTheHardPartsAuthors, 441);
        bookArray[11] = new Book("Micro Frontends in Action", 2020, 3, michaelGeers, 295);
        bookArray[12] = new Book("Microservices for the Enterprise: Designing, Developing, and Deploying", 2018, 8, microservicesForTheEnterpriseAuthors, 444);
        bookArray[13] = new Book("Accelerating Development Velocity Using Docker: Docker Across Microservices", 2018, 6, kinnaryJangla, 168);
        bookArray[14] = new Book("Data Mesh: Delivering Data-Driven Value at Scale", 2022, 8, zhamakDehghani, 345);
        bookArray[15] = new Book("Learn Microservices with Spring Boot: A Practical Approach to RESTful Services Using an Event-Driven Architecture, Cloud-Native Patterns, and Containerization", 2020, 4, moisesMaceroGarcia, 444);
        bookArray[16] = new Book("Fundamentals of Software Architecture: An Engineering Approach. A Comprehensive Guide to Patterns, Characteristics, and Best Practices", 2020, 14, fundamentalsOfSoftwareArchitectureAuthors, 400);
        bookArray[17] = new Book("Designing Event-Driven Systems: Concepts and Patterns for Streaming Services with Apache Kafka", 2018, 3, benStopford, 166);
        bookArray[18] = new Book("Flow Architectures: The Future of Streaming and Event-Driven Integration", 2021, 5, jamesUrquhart, 226);
        bookArray[19] = new Book("Building Micro-Frontends: Scaling Teams and Projects Empowering Developers", 2021, 4, lucaMezzalira, 317);

        return bookArray;
    }
}