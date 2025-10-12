import { RestaurantDto } from "../../types/RestaurantDto";

const restaurantsRepository: RestaurantDto[] = [
    { id: 1, name: "Pizza Place", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 2, name: "Sushi Spot", imageUrl: "https://via.placeholder.com/150", rating: 5 },
    { id: 3, name: "Burger House", imageUrl: "https://via.placeholder.com/150", rating: 3 },
    { id: 4, name: "Taco Time", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 5, name: "TGI wednesdays", imageUrl: "https://via.placeholder.com/150", rating: 2 },
    { id: 6, name: "TGI Wednesdays", imageUrl: "https://via.placeholder.com/150", rating: 2 },
    { id: 7, name: "Pizza Palace", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 8, name: "Sushi World", imageUrl: "https://via.placeholder.com/150", rating: 5 },
    { id: 9, name: "Burger Hub", imageUrl: "https://via.placeholder.com/150", rating: 3 },
    { id: 10, name: "Curry Corner", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 11, name: "Pasta Fiesta", imageUrl: "https://via.placeholder.com/150", rating: 5 },
    { id: 12, name: "Vegan Delight", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 13, name: "Steak House", imageUrl: "https://via.placeholder.com/150", rating: 5 },
    { id: 14, name: "Seafood Shack", imageUrl: "https://via.placeholder.com/150", rating: 3 },
    { id: 15, name: "Bakery Bliss", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 16, name: "Taco Town", imageUrl: "https://via.placeholder.com/150", rating: 4 },
    { id: 17, name: "Dim Sum Express", imageUrl: "https://via.placeholder.com/150", rating: 5 },
    { id: 18, name: "BBQ Barn", imageUrl: "https://via.placeholder.com/150", rating: 3 },
    { id: 19, name: "Coffee Cove", imageUrl: "https://via.placeholder.com/150", rating: 5 },
    { id: 20, name: "Ice Cream Island", imageUrl: "https://via.placeholder.com/150", rating: 4 },
];

export async function getRestaurants(): Promise<RestaurantDto[]> {
    return await Promise.resolve(restaurantsRepository);
}
