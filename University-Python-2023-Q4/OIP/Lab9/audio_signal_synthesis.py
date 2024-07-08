import numpy as np
from scipy.io import wavfile
import matplotlib.pyplot as plt
import math

sampling_rate = 44100


def generate_sine_wave(frequency, duration, amplitude):
    """
    Generates a simple audio signal with a sine wave form.

    Arguments:
      frequency: The frequency of the signal in Hz.
      duration: The duration of the signal in seconds.
      amplitude: The amplitude of the signal.

    Returns:
      A simple audio signal with a sine wave form.
    """
    period = 1 / frequency
    print('Sine wave:')
    print(period)
    print(frequency)
    # Calculate number of samples
    num_samples = int(sampling_rate * duration)

    # Generate a time scale.
    time = np.linspace(0, duration, num_samples)

    # Form the audio signal (eq. 1).
    audio_signal = amplitude * np.sin(2 * np.pi * frequency * time)

    return audio_signal


def generate_rectangular_wave(frequency, duration, amplitude):
    """
    Generates a simple audio signal with a rectangular wave form.

    Arguments:
      frequency: The frequency of the signal in Hz.
      duration: The duration of the signal in seconds.
      amplitude: The amplitude of the signal.

    Returns:
      A simple audio signal with a rectangular wave form.
    """

    period = 1 / frequency
    print('Rectangular wave')
    print(period)
    print(frequency)
    # Calculate number of samples
    num_samples = int(sampling_rate * duration)

    # Generate a time scale.
    time = np.linspace(0, duration, num_samples)

    # Form the audio signal (eq. 2).
    audio_signal = amplitude * np.sign(np.sin(2 * np.pi * frequency * time))

    return audio_signal


def generate_asymetric_triangular_wave(frequency, duration, amplitude):
    """
    Generates a simple audio signal with an asymetric triangular wave form.

    Arguments:
      frequency: The frequency of the signal in Hz.
      duration: The duration of the signal in seconds.
      amplitude: The amplitude of the signal.

    Returns:
      A simple audio signal with an asymetric triangular wave form.
    """

    # Calculate number of samples
    num_samples = int(sampling_rate * duration)

    # Generate a time scale.
    time = np.linspace(0, duration, num_samples)

    # Calculate the period
    period = 1 / frequency
    print(f'Asymetric wave')
    print(period)
    print(frequency)

    # Form the audio signal (eq. 3).
    audio_signal = amplitude * (2 / period * (time % period) - 1)

    return audio_signal


def generate_symetric_triangular_wave(frequency, duration, amplitude):
    """
    Generates a simple audio signal with a symetric triangular wave form.

    Arguments:
      frequency: The frequency of the signal in Hz.
      duration: The duration of the signal in seconds.
      amplitude: The amplitude of the signal.

    Returns:
      A simple audio signal with a symetric triangular wave form.
    """
    # Calculate number of samples
    num_samples = int(sampling_rate * duration)

    # Generate a time scale.
    time = np.linspace(0, duration, num_samples)

    # Calculate the period
    period = 1 / frequency
    print('Symetric wave')
    print(period)
    print(frequency)

    # Form the audio signal (eq. 4).
    audio_signal = 2 * amplitude * (1 - 2 / period * np.abs(time % period - period / 2)) - 1

    return audio_signal


def visualize_signal(audio_signal, duration, title="Audio signal"):
    """
    Visualizes an audio signal.

    Arguments:
      audio_signal: The audio signal to visualize.
      duration: The duration of the signal in seconds.

    Returns:
      None: This function displays the plot but does not return any values.
    """

    time = np.linspace(0, duration, len(audio_signal))

    # Plot the audio signal.
    plt.plot(time, audio_signal)

    # Add labels to the axes.
    plt.xlabel("Time (s)")
    plt.ylabel("Amplitude")

    # Add title
    plt.title(title)

    # Show the plot.
    plt.show()


def plot_positive_spectrum(signal, title="Signal Spectrum (Positive Frequencies Only)"):
    """
    Plot the amplitude spectrum of a signal, showing only positive frequencies.

    Arguments:
      signal (array-like): The input signal for which to calculate the spectrum.
      title (str, optional): The title for the plot (default is "Signal Spectrum (Positive Frequencies Only)").

    Returns:
      None: This function displays the plot but does not return any values.
    """

    # Perform FFT on the signal
    signal_fft = np.fft.fft(signal)

    # Calculate the frequencies associated with the FFT result
    frequencies = np.fft.fftfreq(len(signal), 1 / sampling_rate)

    # Select only positive frequencies
    positive_frequencies = frequencies[:len(frequencies) // 2]
    positive_signal_fft = 2.0 / len(signal) * np.abs(signal_fft[:len(signal) // 2])

    # Plot the amplitude spectrum for positive frequencies
    plt.figure(figsize=(10, 6))

    plt.plot(positive_frequencies, positive_signal_fft)

    # Add labels to the axes.
    plt.xlabel("Frequency (Hz)")
    plt.ylabel("Amplitude")

    # Add title
    plt.title(title)

    # Add grid
    plt.grid(True)

    # Show the plot.
    plt.show()


def save_signal_to_wav(filename, signal):
    """
    Save a signal to a WAV file.

    Arguments:
      filename (str): The name of the output WAV file.
      signal (numpy.ndarray): The signal data as a NumPy array.

    Returns:
      None
    """

    # Calculate the maximum amplitude of the signal
    max_amplitude = np.max(np.abs(signal))

    # Normalize the signal to the range [-1, 1]
    normalized_signal = signal / max_amplitude

    # Write the signal to a WAV file
    wavfile.write(filename, sampling_rate, normalized_signal)


def main():
    """
    The main function.

    This function generates simple audio signals, plays them, visualizes them, plots the spectrum, and saves the signals to wav file formats.
    """

    # Define the parameters for the audio signal.
    frequency = 430  # where x is the last digit of your faculty number !
    duration = 1
    amplitude = 1

    # Generate sine audio signal.
    audio_signal = generate_sine_wave(frequency, duration, amplitude)
    visualize_signal(audio_signal, duration, title="Sin wave")
    plot_positive_spectrum(audio_signal, title="Sin wave spectrum (positive frequencies only)")
    save_signal_to_wav("folder/sin_wave.wav", audio_signal)

    # Generate rectangular audio signal.
    audio_signal_rectangular = generate_rectangular_wave(frequency, duration, amplitude)
    visualize_signal(audio_signal_rectangular, duration, title="Rectangular Wave")
    plot_positive_spectrum(audio_signal_rectangular, title="Rectangular Wave Spectrum (positive frequencies only)")
    save_signal_to_wav("folder/rectangular_wave.wav", audio_signal_rectangular)

    # Generate asymetric triangular audio signal.
    audio_signal_asymmetric_triangular = generate_asymetric_triangular_wave(frequency, duration, amplitude)
    visualize_signal(audio_signal_asymmetric_triangular, duration, title="Asymmetric Triangular Wave")
    plot_positive_spectrum(audio_signal_asymmetric_triangular,
                           title="Asymmetric Triangular Wave Spectrum (positive frequencies only)")
    save_signal_to_wav("folder/asymmetric_triangular_wave.wav", audio_signal_asymmetric_triangular)

    # Generate symetric triangular audio signal.
    audio_signal_symmetric_triangular = generate_symetric_triangular_wave(frequency, duration, amplitude)
    visualize_signal(audio_signal_symmetric_triangular, duration, title="Symmetric Triangular Wave")
    plot_positive_spectrum(audio_signal_symmetric_triangular,
                           title="Symmetric Triangular Wave Spectrum (positive frequencies only)")
    save_signal_to_wav("folder/symmetric_triangular_wave.wav", audio_signal_symmetric_triangular)


if __name__ == "__main__":
    main()
