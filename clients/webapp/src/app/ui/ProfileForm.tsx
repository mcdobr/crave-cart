'use client';
import { Pencil } from "lucide-react";
import { useState } from "react";
import { User } from '@/types/User';

type ProfileFormProps = {
    user: User;
};

const ProfileForm = ({ user }: ProfileFormProps) => {
    const [isEditMode, setEditMode] = useState(false);

    const handleEditClick = (e: React.MouseEvent<HTMLButtonElement>) => {
        e.preventDefault();
        setEditMode(!isEditMode);
    };

    return (
        <div style={{ border: '2px solid yellow' }}>
            <img
                className="w-16 h-16 rounded-full"
                src={user.imageUrl}
                alt={'Photo of ' + user.name}
            />
            <form>
                <EditButton onClick={handleEditClick} />
                <label htmlFor="name">Name:</label>
                <input name="name"></input>
            </form>
        </div>
    );
}

type EditButtonProps = {
    onClick: (e: React.MouseEvent<HTMLButtonElement>) => void
};

const EditButton = ({ onClick }: EditButtonProps) => {
    return (
        <button onClick={onClick}>
            <Pencil size={20} />
        </button>
    );
}

export default ProfileForm;