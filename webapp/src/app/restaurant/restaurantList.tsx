type RestaurantDto = {
    id: number;
    name: string;
}

async function getRestaurants() {
    return await fetch('https://jsonplaceholder.typicode.com/todos/1')
          .then(response => response.json())
          .then(json => {
              console.log(json);
              return json;
          })
          .then(restaurant => <li key={restaurant.userId}>{restaurant.id}</li>)
          .catch(error => console.warn(error));
};

export default function RestaurantList() {
    const restaurantListItems = getRestaurants();

    return (
        <ul>{restaurantListItems}</ul>
    )
}