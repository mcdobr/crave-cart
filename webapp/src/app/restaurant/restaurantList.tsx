export default function RestaurantList() {
    const restaurants = [
        {
            id: 1,
            name: 'Restaurant 1',
        },
        {
            id: 2,
            name: 'Restaurant 2'
        },
    ];
    const restaurantListItems = restaurants.map(restaurant => <li key={restaurant.name}>{restaurant.name}</li>);

    return (
        <>
            <ul>{restaurantListItems}</ul>
        </>
    )
}