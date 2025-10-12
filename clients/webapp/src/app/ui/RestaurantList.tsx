import { RestaurantCard } from "./RestaurantCard";
import { getRestaurants } from "../restaurant/page";
import logger from "@/lib/logger";


export default async function RestaurantList() {
    const restaurants = await getRestaurants();
    logger.info(`Received ${restaurants.length} restaurants`);
    if (logger.isLevelEnabled('debug')) {
        logger.debug({ restaurants }, 'Received restaurants');
    }
    
    return (
        <ul className="flex flex-wrap gap-4">
            {restaurants.map(restaurant => <li key={restaurant.id}><RestaurantCard {...restaurant} /></li>)}
        </ul>
    );
}
