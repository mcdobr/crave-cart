import { RestaurantDto } from "../../types/RestaurantDto";

export const RestaurantCard = (restaurant: RestaurantDto) => {
    return (
        <div className="w-64 bg-white shadow-md rounded-lg p-4 flex flex-col justify-between hover:shadow-xl hover:scale-105 transition-transform duration-300 border border-gray-100">
            <img
                src={restaurant.imageUrl}
                alt={restaurant.name}
                className="w-full h-32 object-cover rounded-md shadow-sm transition-transform duration-300 transform hover:scale-105"
            />
            <div className="mt-2 text-black">
                <div className="restaurant-name">{restaurant.name}</div>
                <div className="restaurant-rating">{restaurant.rating} ⭐</div>
            </div>
        </div>
    );
}