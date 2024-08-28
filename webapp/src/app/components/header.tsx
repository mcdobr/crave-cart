import Profile from "@/app/components/profile";

export default function Header() {
    return (
        <header className="flex items-center justify-between bg-red-100">
            <h1>Header</h1>
            <Profile/>
        </header>
    )
}