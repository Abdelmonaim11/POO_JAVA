import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MetierClientImpl implements IMetier<Client>{
    private List<Client> clientList = new ArrayList<>();

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    @Override
    public Client add(Client client) {
        clientList.add(client);
        return client;
    }

    @Override
    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();
        File clientFile = new File("ClientFile.dat");

        // Vérifiez si le fichier existe et chargez les clients
        if (clientFile.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(clientFile))) {
                clients = (List<Client>) objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return clients;
    }

    @Override
    public Client findByName(String name) {
        Client clientByName = null;
        File file = new File("ClientFile.dat");

        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                List<Client> clients = (List<Client>) objectInputStream.readObject();
                for (Client client : clients) {
                    if (client.getNom().equals(name)) {
                        clientByName = client;
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return clientByName;
    }

    @Override
    public void delete(String name) {
        File file = new File("ClientFile.dat");

        if (file.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                List<Client> clients = (List<Client>) objectInputStream.readObject();

                List<Client> updatedClients = new ArrayList<>();
                boolean clientRemoved = false;

                for (Client client : clients) {
                    if (!client.getNom().equals(name)) {
                        updatedClients.add(client);
                    } else {
                        clientRemoved = true;
                    }
                }

                if (clientRemoved) {
                    try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                        objectOutputStream.writeObject(updatedClients);
                    }
                    System.out.println("Client(s) supprimé(s) avec succès.");
                } else {
                    System.out.println("Client non trouvé.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void saveAll() throws IOException {
        File clientFile = new File("ClientFile.dat");
        List<Client> existingClients = new ArrayList<>();

        // Vérifiez si le fichier existe et chargez les clients existants
        if (clientFile.exists()) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(clientFile))) {
                existingClients = (List<Client>) objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Ajoutez les clients en mémoire (clientList) à la liste existante
        existingClients.addAll(clientList);

        // Sauvegardez tous les clients (nouveaux + existants) dans le fichier
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(clientFile))) {
            objectOutputStream.writeObject(existingClients);
        }

        System.out.println("Clients sauvegardés avec succès.");
    }
}
