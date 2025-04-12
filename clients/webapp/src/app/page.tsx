import Header from "@/app/components/header";
import RestaurantList from "@/app/restaurant/restaurantList";

export default function Home() {
    return (
        <>
            <Header/>

            <main className="flex min-h-screen flex-col items-center justify-between p-24 bg-green-300">
                <RestaurantList/>
            </main>
        </>
    );
}
