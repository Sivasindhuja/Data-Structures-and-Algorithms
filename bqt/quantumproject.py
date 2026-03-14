import string
from qiskit import QuantumCircuit, transpile
from qiskit_aer import AerSimulator

def get_quantum_entropy(num_bits):
    """Generates a string of truly random 0s and 1s using a quantum circuit."""
    # 1. Create a 1-qubit circuit with 1 classical bit for storage
    qc = QuantumCircuit(1, 1)
    
    # 2. Apply Hadamard gate (H) to create a 50/50 superposition
    qc.h(0)
    
    # 3. Measure the qubit into the classical bit
    qc.measure(0, 0)
    
    # 4. Use AerSimulator for local execution
    simulator = AerSimulator()
    compiled_circuit = transpile(qc, simulator)
    
    # 5. Run 'shots' equal to num_bits to get a sequence of random bits
    # Setting memory=True allows us to see the result of every individual shot
    job = simulator.run(compiled_circuit, shots=num_bits, memory=True)
    result = job.result()
    
    # 6. Retrieve the list of individual 0/1 outcomes
    bit_list = result.get_memory()
    return "".join(bit_list)

def generate_secure_coupon(length=8):
    """Converts raw quantum bits into a readable alphanumeric coupon."""
    # We need 6 bits per character to cover A-Z and 0-9 (2^6 = 64 options)
    raw_entropy = get_quantum_entropy(length * 6)
    
    chars = string.ascii_uppercase + string.digits
    coupon = ""
    
    # Step through entropy in 6-bit chunks
    for i in range(0, len(raw_entropy), 6):
        bit_chunk = raw_entropy[i:i+6]
        # Convert binary chunk to an integer index
        index = int(bit_chunk, 2) % len(chars)
        coupon += chars[index]
        
    return coupon

# --- EXECUTION ---
print("Initializing Quantum Circuit...")
new_coupon = generate_secure_coupon(length=10)
print(f"Generated Quantum-Secure Coupon: {new_coupon}")


# Print the circuit diagram
print("\nYour Quantum Circuit Design:")
print(qc.draw(output='text'))
