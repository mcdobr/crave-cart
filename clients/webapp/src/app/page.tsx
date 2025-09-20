import Header from "@/app/ui/Header";
import RestaurantList from "./restaurant/page";

export default function Home() {
    return (
        <>
            <Header/>

            <main className="flex min-h-screen flex-col items-center justify-between p-24 bg-green-300">
                <RestaurantList />
            </main>
        </>
    );
}
