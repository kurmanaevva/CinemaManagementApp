# CinemaManagementApp
First of all, I created 6 packages in src. They are:
        config for the Singleton pattern.
        movie for the Factory Method pattern.
        ui for the Abstract Factory pattern.
        booking for the Builder pattern.
        schedule for the Prototype pattern.
        main for the CinemaManagementApp.

Then I created CinemaConfig that demonstrates the creation of a global configuration using the Singleton pattern. It manages global settings for the cinema.

I defined a Movie interface and implement classes such as RegularMovie, IMAXMovie and implemented a MovieFactory abstract class which declares a method to create movies.
Also I created concrete factories like RegularMovieFactory and IMAXMovieFactory that extend MovieFactory and provide implementations for creating movie objects.

In ui package I define a Button and TextField interface for UI components and implemented concrete components like DarkThemeButton, LightThemeButton, DarkThemeTextField, and LightThemeTextField. An abstract factory interface UIFactory was created for creating themed components. Also implemented concrete factories like DarkThemeFactory and LightThemeFactory.

I defined a TicketBooking class to represent a cinema ticket with attributes like seat number, movie title, and snack combo and implemented a TicketBookingBuilder class to build a TicketBooking object step-by-step in booking package.

In schedule package defined a MovieSchedule interface with a clone() method to support cloning and implemented StandardSchedule that allows for cloning and modification of movie schedules.

And implemented the CinemaManagementApp class in the main package to bring all components together and demonstrate the usage of all five patterns in the system.
