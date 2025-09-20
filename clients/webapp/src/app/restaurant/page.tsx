type RestaurantDto = {
    id: number;
    title: string;
}

async function getRestaurants(): Promise<RestaurantDto[]> {
    return await fetch('https://jsonplaceholder.typicode.com/todos')
        .then(response => response.json())
        .then(json => {
            console.log(json);
            return json;
        })
        .catch(error => console.warn(error));
}

export default async function RestaurantList() {
    const restaurants = await getRestaurants();
    console.debug(`Received restaurants ${restaurants}`);

    return (
        <ul>
            {restaurants.map(restaurant => <li key={restaurant.id}>{restaurant.title}</li>)}
        </ul>
    );
}
