import { RestaurantCard } from "./RestaurantCard";
import { getRestaurants } from "../restaurant/page";


export default async function RestaurantList() {
    const restaurants = await getRestaurants();
    console.debug(`Received restaurants ${restaurants}`);

    console.log(restaurants[0].name);
    return (
        <ul className="flex flex-wrap gap-4">
            {restaurants.map(restaurant => <li key={restaurant.id}><RestaurantCard {...restaurant} /></li>)}
        </ul>
    );
}
